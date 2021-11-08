package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

    public class BuyerInformation {
        private String firstName;
        private String lastName;
        private String zipPostalCode;
        private List<BuyerInformation> buyerInformation = new ArrayList<>();

        public BuyerInformation(List<Map<String, String>> buyerInformationData) {
            createConstructor(buyerInformationData);
        }
        public BuyerInformation(Map<String, String> dataBuyerInformation) {
            this.firstName = dataBuyerInformation.get("firstName");
            this.lastName = dataBuyerInformation.get("lastName");
            this.zipPostalCode = dataBuyerInformation.get("zipPostalCode");
        }

        public void createConstructor(List<Map<String, String>> buyerInformationData) {
            for (Map<String, String> data : buyerInformationData) {
                buyerInformation.add(new BuyerInformation(data));
            }
        }


        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public String getZipPostalCode() { return zipPostalCode;}

        public List<BuyerInformation> thisInformation() {
            return buyerInformation;
        }

    }
