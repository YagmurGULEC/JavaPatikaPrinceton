public class Enterprise extends Account<Enterprise>{
    public Enterprise(User user) {
        super(user);
    }
    @Override
    public void addInsurance(Insurance insurance) {
        insurances.add(insurance);
    }
}
