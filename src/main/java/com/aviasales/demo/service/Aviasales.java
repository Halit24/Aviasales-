package com.aviasales.demo.service;

import com.aviasales.demo.annotation.Loggable;
import com.aviasales.demo.entity.Opersales;
import org.aspectj.lang.annotation.Aspect;

import java.util.HashMap;
public class Aviasales  {
    protected HashMap<String, Opersales> opersalesMap;


    public Aviasales() {
        opersalesMap = new HashMap<>();
    }

    public void addNewOper(Opersales newOpersales) {
        opersalesMap.put(newOpersales.getName(), newOpersales);
    }

    public void printAllOpersales() {
        System.out.println(opersalesMap.keySet());
    }

    public Opersales getConcert(String name) {
        return opersalesMap.get(name);
    }



    public void removeByOper(String name) {
        if (opersalesMap.containsKey(name)) {
            opersalesMap.remove(name);
        } else {
            throw new RuntimeException("Такой оперы нет");
        }
    }


    public void viewOpera(String name) {
        if (name != null && opersalesMap.containsKey(name)) {
            System.out.println(opersalesMap.get(name));
        } else {
            System.out.println(opersalesMap);
        }
    }

    @Loggable
    public void bayTickets(String name) {
        if (name != null && opersalesMap.containsKey(name)) {
            Opersales editOpersales = opersalesMap.get(name);
            if (editOpersales.getPlace() > 0) {
                editOpersales.setPlace(editOpersales.getPlace() - 1);
                opersalesMap.put(name, editOpersales);
                System.out.println("Покупка билета на оперу " + name );
            } else {
                System.out.println("Билетов больше нет");
            }
        } else {
            System.out.println("Не корректно ввели имя Оперы");
        }
    }


    public void ticketRefund(String name) {
        if (name != null && opersalesMap.containsKey(name)) {
            Opersales editOpersales = opersalesMap.get(name);
            editOpersales.setPlace(editOpersales.getPlace() + 1);
            opersalesMap.put(name, editOpersales);
            System.out.println("Билет на оперу " + name + " успешно сдан");
        } else {
            System.out.println("Такой оперы в списке нет");
        }
    }

    public void changeInfo(Opersales opera, String changeField, String newInfo) {
        switch (changeField) {
            case "name":
                opersalesMap.remove(opera.getName());
                opera.setName(newInfo);
                opersalesMap.put(opera.getName(), opera);
                break;
            case "description":
                opera.setDescription(newInfo);
                break;
            case "ageCategory":
                opera.setAgeCategory(newInfo);
                break;
            case "place":
                opera.setPlace(Integer.parseInt(newInfo));
                break;
            default:
                System.out.println("Error");
                break;


        }


    }
}
