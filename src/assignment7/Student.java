package assignment7;


public class Student {
	private String firstName;
	private String lastName;
	private int idNum;
	private int attCredits;
	private int passCredits;
	private double TGQP;
	private double bearBucks;
	

	/*
	 *  getters and setters
	 */
	public String getFirstName() {
		return firstName;}
	public void setFirstName(String firstName) {
		this.firstName = firstName;}
	public String getLastName() {
		return lastName;}
	public void setLastName(String lastName) {
		this.lastName = lastName;}
	public void setIdNum(int idNum) {
		this.idNum = idNum;}
	public int getTotalAttemptedCredits(){
		return attCredits;}
	public void setattCredits(int attCredits){
		this.attCredits = attCredits;}
	public int getId(){
		return idNum;}
	public int getTotalAttemptedPassingCredits(){
		return this.passCredits;}
	public void setbearBucks(double bearBucks){
		this.bearBucks=bearBucks;}
	public double getBearBucksBalance() {
		return this.bearBucks;}
	
	/*
	 *  Constructor
	 */
	public Student(String firstName, String lastName, int idNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNum = idNum;}
	/*
	 *  make full name
	 */
	public String getFullName(){
		return firstName + " " + lastName;}
	
	/*
	 *  Constructor
	 */
	public void submitGrade(double grade, int credit) {
		attCredits += credit;
		TGQP += grade*credit;
		if(grade>=1.7)
			passCredits=passCredits+credit;}

	/*
	 *  calculate GPA
	 */
	public double calculateGradePointAverage(){
		return TGQP/attCredits;}
	
	/*
	 *  figure out year of student through amount of classes
	 */
	public String getClassStanding() {
		if(passCredits<=29)
			return "First Year";
		if(passCredits>=30 && passCredits<60)
			return "Sophomore";
		if(passCredits>=60 && passCredits<90)
			return "Junior";
		else
			return "Senior";
	}
	
	/*
	 *  check greek life with gpa and credits achieved
	 */
	public boolean isEligibleForPhiBetaKappa() {
		if(getTotalAttemptedPassingCredits()>=98 && calculateGradePointAverage() >= 3.60)
			return true;
		if(getTotalAttemptedPassingCredits()>=75 && calculateGradePointAverage() >= 3.80)
			return true;
		else
			return false;
	}
	
	/*
	 *  bear bucks deposited
	 *  param amount is the amount of money
	 */
	public void depositBearBucks(double amount) {	
		bearBucks+=amount;}
	
	/*
	 *  bear bucks deucted
	 *  param amount is the amount of money
	 */
	public void deductBearBucks(double amount) {
		bearBucks-=amount;}

	/*
	 *  cash out the bear bucks and set to 0
	 */
	public double cashOutBearBucks() {
		double wumbo;
		if(bearBucks>10) {
			wumbo = bearBucks-10;
			bearBucks=0;
			return wumbo;
		}
		else {
			bearBucks=0;
			return 0;
		}
	}
	
	/*
	 *  param firstName first name
	 *  param otherParent new student
	 *  param hyphen last name
	 *  param id num number of id
	 */
	public Student createLegacy(String firstName, Student otherParent,
			boolean hyphen, int idNumber) {
		String wumbo = "";
		if(hyphen == true)
			wumbo = this.lastName + "-" + otherParent.lastName;
		else
			wumbo = this.lastName;
		Student s=new Student(firstName,wumbo,idNumber);
		s.depositBearBucks(otherParent.cashOutBearBucks()+this.cashOutBearBucks());
		return s;
	}
	public String toString() {
		return firstName + " " + lastName + " " + idNum;
	}
}
