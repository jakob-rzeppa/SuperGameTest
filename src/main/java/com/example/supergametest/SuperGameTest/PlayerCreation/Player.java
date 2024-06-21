package com.example.supergametest.SuperGameTest.PlayerCreation;

import com.example.supergametest.SuperGameTest.DatabaseConnector;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import lombok.AllArgsConstructor;

import java.sql.ResultSet;

@AllArgsConstructor
public class Player {
    private int playerId;

    public String toJSON() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    private static int saveNewPlayer(int species, int job) {
        DatabaseConnector databaseConnector = new DatabaseConnector();

        databaseConnector.queryWithoutReturn("INSERT INTO Players (name, species, job) VALUES ('test'," + species + "," + job + ")");
        return 0;
    }

    public static Player fromJSON(String jsonString) throws JsonSyntaxException {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        System.out.println(jsonObject.toString());

        try {
            Species species = Species.valueOf(jsonObject.get("species").getAsString());
            Job job = Job.valueOf(jsonObject.get("job").getAsString());

            int playerId = saveNewPlayer(1,1);

            return new Player(playerId);
        } catch (NullPointerException e) {
            throw new JsonSyntaxException("Request does not contain required parameters!");
        }
    }
}
