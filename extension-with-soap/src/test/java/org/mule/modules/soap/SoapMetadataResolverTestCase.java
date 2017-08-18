package org.mule.modules.soap;

import static com.google.common.collect.Collections2.transform;
import static java.util.stream.Collectors.joining;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mule.modules.soap.Services.ABSENCE_MANAGEMENT;
import static org.mule.modules.soap.Services.ACADEMIC_ADVISING;
import static org.mule.modules.soap.Services.ACADEMIC_FOUNDATION;
import static org.mule.modules.soap.Services.ADMISSIONS;
import static org.mule.modules.soap.Services.BENEFITS_ADMINISTRATION;
import static org.mule.modules.soap.Services.CAMPUS_ENGAGEMENT;
import static org.mule.modules.soap.Services.CASH_MANAGEMENT;
import static org.mule.modules.soap.Services.COMPENSATION;
import static org.mule.modules.soap.Services.COMPENSATION_REVIEW;
import static org.mule.modules.soap.Services.DYNAMIC_DOCUMENT_GENERATION;
import static org.mule.modules.soap.Services.FINANCIAL_AID;
import static org.mule.modules.soap.Services.FINANCIAL_MANAGEMENT;
import static org.mule.modules.soap.Services.HUMAN_RESOURCES;
import static org.mule.modules.soap.Services.IDENTITY_MANAGEMENT;
import static org.mule.modules.soap.Services.INTEGRATIONS;
import static org.mule.modules.soap.Services.INVENTORY;
import static org.mule.modules.soap.Services.PAYROLL;
import static org.mule.modules.soap.Services.PAYROLL_CAN;
import static org.mule.modules.soap.Services.PAYROLL_GBR;
import static org.mule.modules.soap.Services.PAYROLL_INTERFACE;
import static org.mule.modules.soap.Services.PERFORMANCE_MANAGEMENT;
import static org.mule.modules.soap.Services.RECRUITING;
import static org.mule.modules.soap.Services.RESOURCE_MANAGEMENT;
import static org.mule.modules.soap.Services.REVENUE_MANAGEMENT;
import static org.mule.modules.soap.Services.SETTLEMENT_SERVICES;
import static org.mule.modules.soap.Services.STAFFING;
import static org.mule.modules.soap.Services.STUDENT_FINANCE;
import static org.mule.modules.soap.Services.STUDENT_RECORDS;
import static org.mule.modules.soap.Services.STUDENT_RECRUITING;
import static org.mule.modules.soap.Services.TALENT;
import static org.mule.modules.soap.Services.TENANT_DATA_TRANSLATION;
import static org.mule.modules.soap.Services.TIME_TRACKING;
import static org.mule.modules.soap.Services.WORKFORCE_PLANNING;
import static org.mule.runtime.module.extension.api.metadata.MultilevelMetadataKeyBuilder.newKey;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;
import org.mule.runtime.api.component.location.Location;
import org.mule.runtime.api.meta.model.operation.OperationModel;
import org.mule.runtime.api.metadata.MetadataKey;
import org.mule.runtime.api.metadata.MetadataService;
import org.mule.runtime.api.metadata.descriptor.ComponentMetadataDescriptor;
import org.mule.runtime.api.metadata.resolving.MetadataResult;
import org.mule.runtime.core.api.registry.RegistrationException;
import org.mule.runtime.core.internal.metadata.MuleMetadataService;
import org.mule.test.runner.RunnerDelegateTo;

import com.google.common.collect.ImmutableList;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunnerDelegateTo(Parameterized.class)
public class SoapMetadataResolverTestCase extends MuleArtifactFunctionalTestCase
{

    protected static Location location;
    protected static MetadataService metadataService;
    private MetadataKey metadataKey;

    @Override
    public int getTestTimeoutSecs() {
        return 999999;
    }

    @Override
    protected String getConfigFile() {
        return "config.xml";
    }

    public SoapMetadataResolverTestCase(MetadataKey metadataKey){
        this.metadataKey = metadataKey;
    }

    @Before
    public void setup() throws Exception {
        location = Location.builder().globalName("invokeFlow").addProcessorsPart().addIndexPart(0).build();
        metadataService = muleContext.getRegistry().lookupObject(MuleMetadataService.class);
    }

    @Parameters(name = "{0}")
    public static Collection<Object[]> data() throws RegistrationException {
        return transform(getMetadataKeys(), input -> new Object[] {
                input
        });
    }

    @Test
    public void testMetadataContent() throws Exception {
        final MetadataResult<ComponentMetadataDescriptor<OperationModel>> metadataDescriptor = metadataService.getOperationMetadata(location, metadataKey);
        String msg = metadataDescriptor.getFailures().stream().map(f -> "Failure: " + f.getMessage()).collect(joining(", "));
        assertThat(msg, metadataDescriptor.isSuccess(), is(true));
    }

    private static String getMetadataId(MetadataKey key) {
        return key.getId().concat("__" + key.getChilds().iterator().next().getId());
    }
    /**
     * To avoid performance issues, the list of NetSuite metadata keys has been narrowed to one operation per service.
     */
    public static ImmutableList<Object> getMetadataKeys() {

        return ImmutableList.builder()
                .add(buildMultilevelKey(ABSENCE_MANAGEMENT.getName(), "Get_Time_Off_Plan_Balances"))
                .add(buildMultilevelKey(ACADEMIC_ADVISING.getName(), "Get_Academic_Progress_for_Student"))
                .add(buildMultilevelKey(ACADEMIC_FOUNDATION.getName(), "Import_Education_Test_Results"))
                .add(buildMultilevelKey(ADMISSIONS.getName(), "Put_Student_Application_Requirement_Assignment"))
                .add(buildMultilevelKey(BENEFITS_ADMINISTRATION.getName(), "Get_Benefit_Individual_Rates"))
                .add(buildMultilevelKey(CAMPUS_ENGAGEMENT.getName(), "Get_Engagement_Conversation_Tags"))
                .add(buildMultilevelKey(CASH_MANAGEMENT.getName(), "Submit_Investment_Pool_Adjustment"))
                .add(buildMultilevelKey(COMPENSATION.getName(), "Put_Compensation_Scorecard_Result"))
                .add(buildMultilevelKey(COMPENSATION_REVIEW.getName(), "Import_Employee_Awards"))
                .add(buildMultilevelKey(DYNAMIC_DOCUMENT_GENERATION.getName(), "Put_Text_Block"))
//                .add(buildMultilevelKey(EXTERNAL_INTEGRATIONS.getName(), "Receive_Launch_Integration_Event")) // Returns null
                .add(buildMultilevelKey(FINANCIAL_AID.getName(), "Import_Financial_Aid_Packages"))
                .add(buildMultilevelKey(FINANCIAL_MANAGEMENT.getName(), "Get_Investors"))
                .add(buildMultilevelKey(HUMAN_RESOURCES.getName(), "Get_Provisioning_Groups"))
                .add(buildMultilevelKey(IDENTITY_MANAGEMENT.getName(), "Get_Workday_Account_Signons"))
                .add(buildMultilevelKey(INTEGRATIONS.getName(), "Cancel_Business_Process"))
                .add(buildMultilevelKey(INVENTORY.getName(), "Submit_Inventory_Par_Count"))
//                .add(buildMultilevelKey(NOTIFICATION.getName(), "Receive_Notification")) // Returns null {"failingComponent":OUTPUT_ATTRIBUTES,"failingElement":null,"message":null,"reason":"java.lang.NullPointerException
                .add(buildMultilevelKey(PAYROLL.getName(), "Put_ROE_History_Data"))
                .add(buildMultilevelKey(PAYROLL_INTERFACE.getName(), "Get_External_Pay_Groups"))
                .add(buildMultilevelKey(PAYROLL_CAN.getName(), "Get_Payroll_CAN_Year_End_Forms"))
                .add(buildMultilevelKey(PAYROLL_GBR.getName(), "Get_Worker_Pensions_Auto_Enrolment_Details"))
//                .add(buildMultilevelKey(PAYROLL_FRA.getName(), "Get_DSN_Data")) // Throws StackOverflow exception
                .add(buildMultilevelKey(PERFORMANCE_MANAGEMENT.getName(), "Put_Certification_Issuer"))
//                .add(buildMultilevelKey(PROFESSIONAL_SERVICES_AUTOMATION.getName(), "Add_Update_Expense_Report")) //Failure: operation [Add_Update_Expense_Report] does not have a body part, Failure: operation [Add_Update_Expense_Report] does not have a body part
                .add(buildMultilevelKey(RECRUITING.getName(), "Move_Candidate_to_Linked_Job_Requisition"))
                .add(buildMultilevelKey(RESOURCE_MANAGEMENT.getName(), "Get_Catalog_Items"))
                .add(buildMultilevelKey(REVENUE_MANAGEMENT.getName(), "Put_Award_Task_Type_Group"))
                .add(buildMultilevelKey(STAFFING.getName(), "Move_Workers_By_Organization"))
                .add(buildMultilevelKey(SETTLEMENT_SERVICES.getName(), "Put_Escheatable_Payment_Notification_Date"))
                .add(buildMultilevelKey(STUDENT_FINANCE.getName(), "Get_Student_Charges"))
                .add(buildMultilevelKey(STUDENT_RECORDS.getName(), "Get_Transcript_Orders"))
                .add(buildMultilevelKey(STUDENT_RECRUITING.getName(), "Get_Search_Service_Definitions"))
                .add(buildMultilevelKey(TALENT.getName(), "Put_Certification_Issuer"))
                .add(buildMultilevelKey(TENANT_DATA_TRANSLATION.getName(), "Put_Translatable_Tenant_Data_Public"))
                .add(buildMultilevelKey(TIME_TRACKING.getName(), "Put_Time_Clock_Events"))
                .add(buildMultilevelKey(WORKFORCE_PLANNING.getName(), "Put_Headcount_Plan_Structure"))
                .build();
    }

    public static MetadataKey buildMultilevelKey(String service, String operation) {
        return newKey(service, "service").withChild(newKey(operation, "operation")).build();
    }

}