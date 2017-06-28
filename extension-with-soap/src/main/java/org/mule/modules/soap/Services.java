/**
 * (c) 2003-2017 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1 a copy of which has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.soap;

public enum Services
{
    ABSENCE_MANAGEMENT ("Absence_Management"),
    ACADEMIC_ADVISING ("Academic_Advising"),
    ACADEMIC_FOUNDATION ("Academic_Foundation"),
    ADMISSIONS ("Admissions"),
    BENEFITS_ADMINISTRATION ("Benefits_Administration"),
    CAMPUS_ENGAGEMENT ("Campus_Engagement"),
    CASH_MANAGEMENT ("Cash_Management"),
    COMPENSATION ("Compensation"),
    COMPENSATION_REVIEW ("Compensation_Review"),
    EXTERNAL_INTEGRATIONS ("External_Integrations"),
    FINANCIAL_AID ("Financial_Aid"),
    FINANCIAL_MANAGEMENT("Financial_Management"),
    HUMAN_RESOURCES ("Human_Resources"),
    IDENTITY_MANAGEMENT ("Identity_Management"),
    INTEGRATIONS ("Integrations"),
    INVENTORY ("Inventory"),
    NOTIFICATION ("Notification"),
    PAYROLL ("Payroll"),
    PAYROLL_CAN ("Payroll_CAN"),
    PAYROLL_FRA ("Payroll_FRA"),
    PAYROLL_GBR ("Payroll_GBR"),
    PAYROLL_INTERFACE ("Payroll_Interface"),
    PERFORMANCE_MANAGEMENT ("Performance_Management"),
    PROFESSIONAL_SERVICES_AUTOMATION ("Professional_Services_Automation"),
    RECRUITING ("Recruiting"),
    RESOURCE_MANAGEMENT ("Resource_Management"),
    REVENUE_MANAGEMENT ("Revenue_Management"),
    SETTLEMENT_SERVICES ("Settlement_Services"),
    STAFFING ("Staffing"),
    STUDENT_RECRUITING ("Student_Recruiting"),
    TALENT ("Talent"),
    TENANT_DATA_TRANSLATION ("Tenant_Data_Translation"),
    TIME_TRACKING ("Time_Tracking"),
    WORKFORCE_PLANNING ("Workforce_Planning"),
    STUDENT_RECORDS ("Student_Records"),
    STUDENT_FINANCE ("Student_Finance"),
    DYNAMIC_DOCUMENT_GENERATION ("Dynamic_Document_Generation");

    private String name;

    Services(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
