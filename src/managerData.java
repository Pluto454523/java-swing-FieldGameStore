/* 
    Project     : Field Gmae Store (Java swing using filedata)
    
    Author      : Nawin Khamchun ( CODING & UI DESIGN )
    Contact     : https://www.facebook.com/Pluto3399/
    
    Design      : Pannawat Imsin ( UI DESIGN ) 
    Contact     : https://www.facebook.com/Pannawat.kj

*/
import Until.ManageFile;

public class managerData {

    private static ManageFile fileProduct, fileEmployee, fileCustomer, fileHistory;
    private static String[][] dataProduct, dataEmployee, dataCustomer, dataHistory;
    private static String[][] SumaryData;
    private static String usernameEmployee = "";

    public managerData() {

        fileProduct = new ManageFile("dataProduct", ".txt");
        dataProduct = fileProduct.getData();

        fileEmployee = new ManageFile("dataEmployee", ".txt");
        dataEmployee = fileEmployee.getData();

        fileCustomer = new ManageFile("dataCustomer", ".txt");
        dataCustomer = fileCustomer.getData();

        fileHistory = new ManageFile("orderHistory", ".txt");
        dataHistory = fileHistory.getData();

    }

    public static String[][] getDataProduct() {

        return dataProduct;
    }

    public static String[][] getDataEmployee() {

        return dataEmployee;
    }

    public static String[][] getDataCustomer() {

        return dataCustomer;
    }

    public static String[][] getDataHistory() {

        return dataHistory;
    }

    public static String getProductCount() {

        return String.valueOf(dataProduct.length);
    }

    public static String getCustomerCount() {

        return String.valueOf(dataCustomer.length);
    }

    public static String getEmployeeCount() {

        return String.valueOf(dataEmployee.length);
    }

    public static String getOrderCount() {

        return String.valueOf(dataHistory.length);
    }

    public static String getSureNameEmployee() {

        String result = "";
        String[][] data = dataEmployee;
        for (int i = 0; i < data.length; i++) {

            if (usernameEmployee.equals(data[i][0])) {

                System.out.println(data[i][2]);
                result = String.valueOf(data[i][2]);
                break;

            } else {
                result = "You are not logged in";
            }

        }
        return result;
    }

    public static String[][] getSumaryDataByDate(String datetime) {

        int countData = 0;

        for (int i = 0; i < dataHistory.length; i++) {

            countData++;

        }

        SumaryData = new String[countData][6];

        int countDataTable = 0;

        for (int i = 0; i < dataHistory.length; i++) {

            if (datetime.equals(dataHistory[i][5])) {

                for (int j = 1; j < 6; j++) {

                    SumaryData[countDataTable][0] = String.valueOf(countDataTable + 1);
                    SumaryData[countDataTable][j] = dataHistory[i][j];

                }

                countDataTable++;

            }
        }

        return SumaryData;

    }

    public static void setUsernameEmployee(String username) {

        if (username.isEmpty()) {

            managerData.usernameEmployee = "Anonymous";

        } else {

            managerData.usernameEmployee = username;
        }
    }

    public static void addOrderHistoryData(String customer, String seller, String product, String price, String date) {

        int dataCount = dataHistory.length;

        // System.out.print(dataCount);

        if (dataCount > 0) {

            String id = String.valueOf(Integer.parseInt(dataHistory[dataCount - 1][0]) + 1);
            String[] dataHistory = { id, customer, seller, product, price, date };
            fileHistory.setSizeData(dataCount, 6);
            fileHistory.writeDataByArr(dataHistory);

        } else {

            String[][] dataHistory = { { "1", customer, seller, product, price, date } };
            fileHistory.writeDataNewToFile(dataHistory);

        }

    }

    public static void addCustomer(String customer, String address, String telephone, String email) {

        String[][] data = dataCustomer;
        int dataCount = data.length;

        if (dataCount > 0) {

            for (int i = 0; i < dataCount;) {

                if (data[i][0].equals(customer)) {

                    // System.out.printn( "Check " + data[i][0] + " is equal " + customer + " = TRUE

                    data[i][1] = address;
                    data[i][2] = telephone;
                    data[i][3] = email;
                    fileCustomer.writeDataNewToFile(data);

                    break;

                } else {

                    if (i == dataCount - 1) {

                        // System.out.println( "Check " + data[i][0] + " is equal " + customer + " =
                        // FALSE");

                        String[] newDataCustomer = { customer, address, telephone, email };
                        fileCustomer.setSizeData(dataCount, 4);
                        fileCustomer.writeDataByArr(newDataCustomer);
                        break;

                    }

                    // System.out.println("LINE " + i + " CHECK");
                    i++;

                }

            }

        } else {

            String[][] newDataCustomer = { { customer, address, telephone, email } };
            fileCustomer.writeDataNewToFile(newDataCustomer);

        }

    }

    public static void saveProductData(String[][] data) {

        fileProduct.writeDataNewToFile(data);

    }

    public static void saveCustomertData(String[][] data) {

        fileCustomer.writeDataNewToFile(data);

    }

    public static void saveEmployeeData(String[][] data) {

        fileEmployee.writeDataNewToFile(data);

    }

    public static boolean checkLogin() {

        boolean result = false;
        String[][] data = dataEmployee;

        for (int i = 0; i < data.length; i++) {

            if (usernameEmployee.toString().equals(data[i][0])) {

                result = true;

                break;

            } else if (i == data.length - 1) {

                result = false;

            }

        }

        return result;

    }

}
