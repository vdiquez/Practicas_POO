package src.poo.colecciones;

import java.util.ArrayList;
import java.util.List;

public class AppCompany {
    public static void main(String[] args) {
        /*String[] nombresEmpleados = {"Luisa", "Maria", "Marta", "Pablo", "Cristina", "Jose"};
        String[] dniEmpleados = {"34232221", "67876545", "1987689", "23565323", "87678763", "987657"};
        byte[] edadesEmpleados = {23, 45, 21, 43, 34, 72};*/

        byte cantidadEmpleados = 6;

        Employee employee1 = new Employee("Luisa", "34232221", (byte) 23);
        Employee employee2 = new Employee("Maria", "67876545", (byte) 45);
        Employee employee3 = new Employee("Marta", "1987689", (byte) 21);
        Employee employee4 = new Employee("Pablo", "23565323", (byte) 43);
        Employee employee5 = new Employee("Cristina", "87678763", (byte) 34);
        Employee employee6 = new Employee();
        employee6.setNombre("Jose");
        employee6.setDni("87678763");
        employee6.setEdad((byte) 72);

        ArrayList<Employee> empleados = new ArrayList<>();
        empleados.add(employee1);
        empleados.add(employee2);
        empleados.add(employee3);
        empleados.add(employee4);
        empleados.add(employee5);
        empleados.add(employee6);

        /*for (int i = 0; i < nombresEmpleados.length; i++) {
            empleados.add(new Employee(nombresEmpleados[i], dniEmpleados[i], edadesEmpleados[i]));
        }*/

        System.out.println("*****Listado de Empleados******");
        reportEmployeeData(empleados);
        //System.out.println("*****Listado de Empleados******\n" + empleados);
        System.out.println("**Cantidad de empleados que tiene la empresa: " + empleados.size());

        ArrayList empleadosMenores30 = getFromEmployeesLessThanThirty(empleados);
        System.out.println("\n*****Listado de Empleados Menores de 30******");
        reportEmployeeData(empleadosMenores30);
        System.out.println("**Cantidad de empleados menores de 30: " + empleadosMenores30.size());

        /*List<Employee> employeesLessThanThirty = new ArrayList<>();

        for (Employee employee: empleados) {
            if (employee.getEdad() < 30) {
                employeesLessThanThirty.add(employee);
            }
        }*/

        //System.out.println("*****Listado de Empleados Menores de 30******\n" + employeesLessThanThirty);
        //System.out.println("Cantidad de empleados menores de 30: " + employeesLessThanThirty.size());

    }

    public static void reportEmployeeData(ArrayList<Employee> employees) {
        //int cantidadEmpleados = 0;
        for (Employee employee: employees) {
            System.out.println(employee);
            //cantidadEmpleados++;
        }
        //System.out.println("La cantidad de empleados de la empresa es: " + cantidadEmpleados);
    }

    public static ArrayList getFromEmployeesLessThanThirty(ArrayList<Employee> employees) {
        ArrayList<Employee> employeesLessThanThirty = new ArrayList<>();

        for (Employee employee: employees) {
            if (employee.getEdad() < 30) {
                employeesLessThanThirty.add(employee);
            }
        }
        return employeesLessThanThirty;
    }
}
