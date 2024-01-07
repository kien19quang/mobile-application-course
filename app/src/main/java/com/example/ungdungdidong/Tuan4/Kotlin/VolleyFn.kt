package com.example.ungdungdidong.Tuan4.Kotlin

import android.content.Context
import android.widget.TextView
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley

class VolleyFn {
    var strJson = "";
    fun getJsonArrayObject (context: Context, textview: TextView) {
        val queue = Volley.newRequestQueue(context);
        var url = "https://batdongsanabc.000webhostapp.com/thanglong/array_json_new.json";
        val request = JsonArrayRequest(url,
            Response.Listener {
                response ->
                    for (i in 0 until response.length()) {
                        val person = response.getJSONObject(i);
                        val id = person.getString("id");
                        val name = person.getString("name");
                        val email = person.getString("email");

                        strJson += "Id: $id\n";
                        strJson += "Name: $name\n";
                        strJson += "Email: $email\n";
                    }
                textview.text = strJson;
            },
            Response.ErrorListener {
                error -> textview.text = error.message
            }
        )
        queue.add(request);
    }
}