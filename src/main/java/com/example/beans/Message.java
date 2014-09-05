/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.beans;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;

@SessionScoped
public class Message implements Serializable
{
    private String message;

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
