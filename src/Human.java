public class Human {
    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + dateOfBirth + " году. Я работаю" + jobTitle + ". Будем знакомы!";
    }

    int dateOfBirth;
    String name;
    String town;
String jobTitle;
    Human(int dateOfBirth, String name, String town, String jobTitle) {
        if(dateOfBirth<0){
            this.dateOfBirth = 0;
        }else
        this.dateOfBirth = dateOfBirth;
        if (name == null || name == " "){
            this.name = "Информация не указана";
        }else
        this.name = name;
        if (town == null || town == " ") {
            this.town = "Информация не указана";
        }else
        this.town = town;
        if (jobTitle == null || jobTitle == " ") {
            this.jobTitle = "Информация не указана";
        }else
        this.jobTitle = jobTitle;
    }
}