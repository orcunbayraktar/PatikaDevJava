package SalaryCalculation;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    String name;
    int salary;
    int workHour;
    int hireYear;

    Employee(String name, int salary, int workHour, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHour=workHour;
        this.hireYear=hireYear;
    }
    double tax(){
        if (this.salary >= 1000)
            return this.salary * 0.03;

        return 0.0;
    }
    int bonus (){
        if( this.workHour > 40 ){

            return (this.workHour-40) * 30;
        }
        return 0;
    }

    double raiseSalary(){

        Calendar calendar = Calendar.getInstance();

        if ((calendar.get(Calendar.YEAR)-this.hireYear) > 19)
            return this.salary * 0.15;
        else if((calendar.get(Calendar.YEAR) - this.hireYear) > 9)
            return  this.salary *0.1;
        else
            return  this.salary *0.05;
    }

    void toStrings(){
        System.out.println("Adı :" + this.name);
        System.out.println("Maaşı :" + this.salary);
        System.out.println("Çalışma Saati :" + this.workHour);
        System.out.println("Başlagıç yılı :" + this.hireYear);
        System.out.println("Vergi :" + tax());
        System.out.println("Bonus :" + bonus());
        System.out.println("Maas artışı : " + raiseSalary() );
        System.out.println("Vergi ve Bonuslar ile birlikde maaş :" + (this.salary - tax() +bonus()) );
        System.out.println("Toplam maas : " + (this.salary + raiseSalary() + bonus() -tax() ) );

    }
}
