public class Organization  {
    private int organizationCode;
    private String organizationName;
    private String organizationAddress;

    public Organization(int organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

    public int getOrganizationCode() {
        return organizationCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

    @Override
    public Organization clone() {
        try {
            return (Organization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    public static void main(String[] args) {
        Organization originalOrg = new Organization(1, "ABC Corp", "123 Main St");

        Organization clonedOrg = originalOrg.clone();
        clonedOrg.organizationName = "XYZ Corp";
        clonedOrg.organizationAddress = "456 Oak St";

        System.out.println("Original Organization:");
        originalOrg.printDetails();
        System.out.println("\nCloned Organization:");
        clonedOrg.printDetails();
    }
}
