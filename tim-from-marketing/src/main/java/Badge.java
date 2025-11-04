class Badge {
    public String print(Integer id, String name, String department) {

        String withId = "";
        if (id != null) {
            withId = "[" + id + "] - ";
        }

        String withDept = "";
        if (department == null) {
            withDept = "OWNER";
        } else {
            withDept = department.toUpperCase();
        }

        return withId + name + " - " + withDept;
    }
}
