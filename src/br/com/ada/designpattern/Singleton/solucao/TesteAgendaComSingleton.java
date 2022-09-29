package br.com.ada.designpattern.Singleton.solucao;

import br.com.ada.designpattern.Singleton.problema.Agenda;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteAgendaComSingleton {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
        AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();
        System.out.println(agenda1);
        System.out.println(agenda2);

        reservaDiaEAGER("Sexta");
        reservaDiaEAGER("Sabado");

        AgendaSingletonLAZY agenda3 = AgendaSingletonLAZY.getInstance();
        AgendaSingletonLAZY agenda4 = AgendaSingletonLAZY.getInstance();
        System.out.println(agenda3);
        System.out.println(agenda4);

        // reflection
        Constructor<AgendaSingletonLAZY> construtorTravesso = AgendaSingletonLAZY.class.getDeclaredConstructor();
        construtorTravesso.setAccessible(true);
        AgendaSingletonLAZY agendaTravessa1 = construtorTravesso.newInstance();
        AgendaSingletonLAZY agendaTravessa2 = construtorTravesso.newInstance();

        System.out.println(agendaTravessa1);
        System.out.println(agendaTravessa2);

        reservaDiaLAZY("Sexta");
        reservaDiaLAZY("Sabado");

        AgendaSingletonEnum agenda5 = AgendaSingletonEnum.getInstance();
        AgendaSingletonEnum agenda6 = AgendaSingletonEnum.getInstance();
        System.out.println(agenda5.hashCode());
        System.out.println(agenda6.hashCode());

        // reflection
        Constructor<AgendaSingletonEnum> construtorTravesso1 = AgendaSingletonEnum.class.getDeclaredConstructor();
        construtorTravesso.setAccessible(true);
        AgendaSingletonEnum agendaTravessa3 = construtorTravesso1.newInstance();
        AgendaSingletonEnum agendaTravessa4 = construtorTravesso1.newInstance();

        System.out.println(agendaTravessa3.hashCode());
        System.out.println(agendaTravessa4.hashCode());

        reservaDiaEnum("Sexta");
        reservaDiaEnum("Sabado");
    }

    public static void reservaDiaEAGER(String dia){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaLAZY(String dia){
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaEnum(String dia){
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

}
