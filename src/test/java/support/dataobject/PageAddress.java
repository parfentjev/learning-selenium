package support.dataobject;

public enum PageAddress {
    HOME(""),
    LOGIN("login");

    private final String address;

    PageAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
