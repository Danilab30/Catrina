/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import com.google.gson.Gson;
import java.util.Date;
import mx.itson.catrina.enums.TypeTransactions;

/**
 *
 * @author dani_
 */
public class Transactions {
    private Date date;
    private String description;
    private double amount;
    private TypeTransactions type;

    public  Transactions deserialize(String json){
        Transactions transactions = new Transactions();
        try{
            transactions = new Gson().fromJson(json, Transactions.class);
           
        }catch(Exception ex){
            System.err.println("Ocurrio un error: " + ex.getMessage());
        }
        return transactions;
    }
    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the type
     */
    public TypeTransactions getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(TypeTransactions type) {
        this.type = type;
    }
    
   
}
