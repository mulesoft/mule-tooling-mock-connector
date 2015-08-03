/**
 * This file was automatically generated by the Mule Development Kit
 */
package org.mule.modules.mockdynamic;

import org.mule.api.ConnectionException;
import org.mule.api.annotations.Connect;
import org.mule.api.annotations.ConnectionIdentifier;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Disconnect;
import org.mule.api.annotations.MetaDataKeyRetriever;
import org.mule.api.annotations.MetaDataRetriever;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.Query;
import org.mule.api.annotations.QueryTranslator;
import org.mule.api.annotations.ValidateConnection;
import org.mule.api.annotations.param.*;
import org.mule.common.metadata.*;
import org.mule.common.metadata.builder.DefaultMetaDataBuilder;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.query.DsqlQuery;
import org.mule.common.query.DsqlQueryVisitor;
import org.mule.modules.mockdynamic.mascot.Breeder;
import org.mule.modules.mockdynamic.mascot.Race;
import org.mule.modules.mockdynamic.utils.Employee;
import org.mule.modules.mockdynamic.utils.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Cloud Connector
 *
 * @author MuleSoft, Inc.
 */
@Connector(name = "mockdyn", description = "Mock Dynamic Connector", friendlyName = "Mock Dynamic Connector", schemaVersion = "1.0-SNAPSHOT")
public class MockDynamicConnector {

    private List<Map<String, Object>> queryResult;
    private String username;

    /**
     * Connect
     *
     * @param username A username
     * @param password A password
     * @throws ConnectionException
     */
    @Connect
    public void connect(@ConnectionKey String username, String password)
            throws ConnectionException {
        this.username = username;

        if (queryResult == null) {
            queryResult = new ArrayList<Map<String, Object>>();
            queryResult.add(createUserObject());
        }
    }

    private Map<String, Object> createUserObject() {
        Date birthDate = null;
        try {
            birthDate = new SimpleDateFormat("dd/MM/yyyy").parse("19/03/1983");
        } catch (ParseException e) {

        }
        final Map<String, Object> result = new HashMap<String, Object>();
        result.put("Name", "Mariano");
        result.put("Last Name", "de Achaval");
        result.put("Age", 30);
        result.put("Male", true);
        result.put("Photo", new Byte[10]);
        result.put("Category", UserCategory.GOLD);
        result.put("BirthDate", birthDate);
        result.put("DueDate", Calendar.getInstance());
        try {
            result.put("ExpirationTime", DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(2008, 10, 1)));
        } catch (DatatypeConfigurationException e) {

        }

        return result;
    }


    private Map<String, Object> createClientObject() {

        final Map<String, Object> result = new HashMap<String, Object>();
        result.put("Name", "Panchito");
        result.put("Last Name", "Panchito");
        result.put("Age", 31);
        return result;
    }

    private Map<String, Object> createMascotObject() {

        final Map<String, Object> result = new HashMap<String, Object>();
        result.put("Name", "Panchito");
        Race pointerRace = new Race("Pointer");
        pointerRace.setBestMatchRace(pointerRace);
        pointerRace.setBreeder(new Breeder("The panchitos"));
        result.put("Race", pointerRace);
        return result;
    }

    private Map<String, Object> createFamilyObject() {

        final ArrayList<Map<String, Object>> maps = new ArrayList<Map<String, Object>>();
        final Map<String, Object> result = new HashMap<String, Object>();
        result.put("Name", "Achaval's");
        maps.add(createUserObject());
        result.put("Members", maps);
        return result;
    }

    private DefinedMapMetaDataModel createUserModel() {
        return new DefaultMetaDataBuilder().
                createDynamicObject("User")
                .addSimpleField("Name", DataType.STRING).setDescription("The user name")
                .addSimpleField("Last Name", DataType.STRING)
                .addSimpleField("Age", DataType.INTEGER)
                .addSimpleField("Debt", DataType.DECIMAL)
                .addSimpleField("Points", DataType.DOUBLE)
                .addSimpleField("Savings", DataType.INTEGER)
                .addSimpleField("Male", DataType.BOOLEAN)
                .addSimpleField("Photo", DataType.BYTE)
                .addSimpleField("Category", DataType.ENUM)
                .addSimpleField("BirthDate", DataType.DATE)
                .addSimpleField("ExpirationTime", DataType.DATE_TIME, XMLGregorianCalendar.class.getName())
                .addSimpleField("DueDate", DataType.DATE_TIME, Calendar.class.getName()).build();
    }

    private DefinedMapMetaDataModel createClient() {
        return new DefaultMetaDataBuilder().
                createDynamicObject("Client")
                .addSimpleField("Name", DataType.STRING)
                .addSimpleField("Last Name", DataType.STRING)
                .addSimpleField("Age", DataType.INTEGER).build();
    }


    private DefinedMapMetaDataModel createAccount() {
        return new DefaultMetaDataBuilder().
                createDynamicObject("Account")
                .addSimpleField("Name", DataType.STRING)
                .addSimpleField("Id", DataType.STRING)
                .addSimpleField("State", DataType.STRING).build();
    }

    private PojoMetaDataModel createEmployee() {
        return new DefaultMetaDataBuilder().createPojo(Employee.class).build();
    }

    private Employee createEmployeePerson() {
        Employee employee = new Employee();
        employee.setLastName("Chuck");
        employee.setLastName("Norris");
        employee.setEmployeeNumber("1");
        employee.setPosition("CEO");
        employee.setId("1");
        return employee;
    }


    /**
     * Disconnect
     */
    @Disconnect
    public void disconnect() {
        queryResult = null;
    }

    /**
     * Are we connected
     */
    @ValidateConnection
    public boolean isConnected() {
        return queryResult != null;
    }

    /**
     * Are we connected
     */
    @ConnectionIdentifier
    public String connectionId() {
        return username;
    }

    /**
     * Create items;
     * <p>
     * {@sample.xml ../../../doc/mock-dynamic-connector.xml.sample mockdyn:create}
     *
     * @param type The object type to create;
     * @param item A list of items to create.
     */
    @Processor
    public void create(@MetaDataKeyParam String type, @Default("#[payload]") @Optional Map<String, Object> item) {
        this.queryResult.add(item);
    }

    /**
     * Get items;
     * <p>
     * {@sample.xml ../../../doc/mock-dynamic-connector.xml.sample mockdyn:query}
     *
     * @param query The query.
     * @return the query results.
     */
    @Processor
    public List<Map<String, Object>> query(@Query String query) {
        return queryResult;
    }

    /**
     * Get client;
     * <p>
     * {@sample.xml ../../../doc/mock-dynamic-connector.xml.sample mockdyn:get-client}
     *
     * @param id The id of the client to search
     * @return the Client Result.
     */
    @Processor
    @MetaDataStaticKey(type = "CLIENT")
    public Map<String, Object> getClient(String id) {
        return createClientObject();
    }

    /**
     * Get client;
     * <p>
     * {@sample.xml ../../../doc/mock-dynamic-connector.xml.sample mockdyn:get-labeled-object}
     *
     * @param id The id of the client to search
     * @return the LabeledObject Result.
     */
    @Processor
    @MetaDataStaticKey(type = "LabeledObject")
    public Map<String, Object> getLabeledObject(String id) {
        return Collections.emptyMap();
    }

    /**
     * Create client;
     * <p>
     * {@sample.xml ../../../doc/mock-dynamic-connector.xml.sample mockdyn:create-client}
     *
     * @param client The client to create
     */
    @Processor
    public void createClient(@MetaDataStaticKey(type = "CLIENT") @Default("#[payload]") @Optional Map<String, Object> client) {
        queryResult.add(client);
    }

    /**
     * Create and Get client;
     * <p>
     * {@sample.xml ../../../doc/mock-dynamic-connector.xml.sample mockdyn:create-and-get-client}
     *
     * @param client The client to create and get
     * @return a client
     */
    @Processor
    @MetaDataStaticKey(type = "CLIENT")
    public Map<String, Object> createAndGetClient(@MetaDataStaticKey(type = "CLIENT") @Default("#[payload]") @Optional Map<String, Object> client) {
        return createClientObject();
    }


    /**
     * Get Employee;
     * <p>
     * {@sample.xml ../../../doc/mock-dynamic-connector.xml.sample mockdyn:get-employee}
     *
     * @param type a class name that inherits from Person, in this case for testing use org.mule.modules.mockdynamic.utils.Employee
     * @return a client
     */
    @Processor
    public Person getEmployee(@MetaDataKeyParam(affects = MetaDataKeyParamAffectsType.OUTPUT) String type) {
        return createEmployeePerson();
    }


    /**
     * Get items;
     * <p>
     * {@sample.xml ../../../doc/mock-dynamic-connector.xml.sample mockdyn:get-client-from-account}
     *
     * @param account The account to retrieve the client associated to it
     * @return a client
     */
    @Processor
    @MetaDataStaticKey(type = "CLIENT")
    public Map<String, Object> getClientFromAccount(@MetaDataStaticKey(type = "ACCOUNT") @Default("#[payload]") @Optional Map<String, Object> account) {
        return createClientObject();
    }

    /**
     * Get items;
     * <p>
     * {@sample.xml ../../../doc/mock-dynamic-connector.xml.sample mockdyn:querySingle}
     *
     * @param query The query.
     * @return the query results.
     */
    @Processor
    public Object querySingle(@Query String query) {
        return queryResult.get(0);
    }

    @QueryTranslator
    public String translate(DsqlQuery query)

    {
        DsqlQueryVisitor queryVisitor = new DsqlQueryVisitor();
        query.accept(queryVisitor);
        return queryVisitor.dsqlQuery();
    }

    /**
     * Get item.
     * <p>
     * {@sample.xml ../../../doc/mock-dynamic-connector.xml.sample mockdyn:get}
     *
     * @param type the object type to retrieve.
     * @param id   Object ID. If less than zero, it will return null.
     * @return an object.
     */
    @Processor
    public Object get(@MetaDataKeyParam String type, int id) {
        if (id < 0) {
            return null;
        }
        if (type.equals("User")) {
            return createUserObject();
        } else if (type.equals("Family")) {
            return createFamilyObject();
        } else { //if(type.equals("Mascots")) {
            return createMascotObject();
        }
    }

    @MetaDataKeyRetriever
    public List<MetaDataKey> getMetaDataKeys() {
        List<MetaDataKey> list = new ArrayList<MetaDataKey>();
        list.add(new DefaultMetaDataKey("User", "User"));
        list.add(new DefaultMetaDataKey("Family", "Family"));
        list.add(new DefaultMetaDataKey("Mascots", "Mascots"));
        list.add(new DefaultMetaDataKey("Client", "Client"));
        list.add(new DefaultMetaDataKey("Account", "Account"));
        list.add(new DefaultMetaDataKey("TypeWithNonSelectableFields", "TypeWithNonSelectableFields"));
        list.add(new DefaultMetaDataKey("LabeledObject", "LabeledObject"));
        return list;
    }


    @MetaDataRetriever
    public MetaData getMetaData(MetaDataKey key) {
        if (key.getId().equals("User")) {
            return new DefaultMetaData(createUserModel());
        } else if (key.getId().equalsIgnoreCase("Family")) {
            return new DefaultMetaData(createFamilyModel());
        } else if (key.getId().equalsIgnoreCase("Client")) {
            return new DefaultMetaData(createClient());
        } else if (key.getId().equalsIgnoreCase("Account")) {
            return new DefaultMetaData(createAccount());
        } else if (key.getId().equalsIgnoreCase("Mascots")) {
            return new DefaultMetaData(createMascotsModel());
        } else if (key.getId().equalsIgnoreCase("Employee")) {
            return new DefaultMetaData(createEmployee());
        } else if (key.getId().equalsIgnoreCase("TypeWithNonSelectableFields")) {
            return new DefaultMetaData(createTypeWithNonSelectableFields());
        } else if (key.getId().equalsIgnoreCase("LabeledObject")) {
            return new DefaultMetaData(createLabeledObject());
        }
        throw new RuntimeException("Invalid key");
    }


    private MetaDataModel createTypeWithNonSelectableFields() {
        return new DefaultMetaDataBuilder().createDynamicObject("TypeWithNonSelectableFields") //
                .addSimpleField("Field1", DataType.STRING).isSelectCapable(false) //
                .addSimpleField("Field2", DataType.INTEGER).isSelectCapable(false) //
                .build();
    }

    private DefinedMapMetaDataModel createMascotsModel() {
        return new DefaultMetaDataBuilder().createDynamicObject("Mascot") //
                .addSimpleField("Name", DataType.STRING) //
                .addPojoField("Race", Race.class) //
                .build();

    }

    private DefinedMapMetaDataModel createFamilyModel() {
        return new DefaultMetaDataBuilder().createDynamicObject("Family").addListOfDynamicObjectField("Members")
                .addSimpleField("Name", DataType.STRING)
                .addSimpleField("Last Name", DataType.STRING)
                .addSimpleField("Age", DataType.NUMBER)
                .addSimpleField("Male", DataType.BOOLEAN)
                .addSimpleField("Photo", DataType.BYTE)
                .addEnumField("Category").setValues("Big", "Small", "Medium")
                .addSimpleField("BirthDate", DataType.DATE)
                .addSimpleField("ExpirationTime", DataType.DATE_TIME)
                .endDynamicObject()
                .addSimpleField("Name", DataType.STRING)
                .addDynamicObjectField("Properties")
                .addSimpleField("isDisfunctional", DataType.BOOLEAN)
                .addSimpleField("numberOfPets", DataType.INTEGER)
                .endDynamicObject()
                .build();
    }

    private DefinedMapMetaDataModel createLabeledObject() {
        return new DefaultMetaDataBuilder().createDynamicObject("Root").addList("LabeledObject")
                .ofDynamicObject("LabeledObject")
                .addSimpleField("Name_1", DataType.STRING).setLabel("Name")
                .addSimpleField("1_bla", DataType.STRING).setLabel("Bla")
                .endDynamicObject()
                .endList()
                .build();
    }
}
