package com.jptadros.jpsnewsnewyorktimes.JsontoKotlin

import android.annotation.SuppressLint
import android.util.Log
import com.jptadros.jpsnewsnewyorktimes.JsontoKotlin.NewsData
import org.json.JSONObject
import org.json.JSONTokener

class ConvertStringToObjectArray {

    fun ConvertStringToObjectArray(jsonSting: String) {
        val jsonObject = JSONTokener(jsonSting).nextValue() as JSONObject

        val jsonArray = jsonObject.getJSONArray("data")

         var response: NewsData

        for (i in 0 until jsonArray.length()) {

            // ID
            val id = jsonArray.getJSONObject(i).getString("abstract")
            Log.i("ID: ", id)



            // Employee
            val employee = jsonArray.getJSONObject(i).getJSONObject("employee")

            // Employee Name
            val employeeName = employee.getString("name")
            Log.i("Employee Name: ", employeeName)

            // Employee Salary
            val employeeSalary = employee.getJSONObject("salary")

            // Employee Salary in USD
            val employeeSalaryUSD = employeeSalary.getInt("usd")
            Log.i("Employee", employeeSalaryUSD.toString())

            // Employee Salary in EUR
            val employeeSalaryEUR = employeeSalary.getInt("eur")
            Log.i("Employee Salary: ", employeeSalaryEUR.toString())

            // Employee Age
            val employeeAge = employee.getString("age")
            Log.i("Employee Age: ", employeeAge)




            // Notify the adapter
        }
    }
// Pass adapter to the RecyclerView adapter

}