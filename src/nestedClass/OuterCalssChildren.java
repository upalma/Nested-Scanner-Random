package nestedClass;

public class OuterCalssChildren {
    innerFather father = new innerFather();
    innerMother mother = new innerMother();

    public void son() {
        System.out.println("Son has his own job");
        father.fatherBankAccount();
        father.fatherBusiness();
        mother.motherIndustry();
        mother.motherProperity();
    }
    public void daughter() {
        System.out.println("Daughter is Studing in NYC University");
        father.fatherBankAccount();
        father.fatherBusiness();
        mother.motherIndustry();
        mother.motherProperity();
    }
    public class innerFather{
        private void fatherBusiness(){
            System.out.println("Father has business");
        }
        private void fatherBankAccount(){
            System.out.println("Father Account has lots of money");
        }
    }
    public class innerMother{
        private void motherIndustry(){
            System.out.println("Mother has three Garments industry");
        }
        private void motherProperity (){
            System.out.println("Mother has has lots of jewelary");
        }
    }
}
