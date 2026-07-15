package com.rajesh;

import com.rajesh.servletcontext.Team;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeamMapper {

    public Team map(ResultSet rs) throws SQLException {
        String teamName = rs.getString("teamName");
        String trophies = rs.getString("trophies");
        String player   = rs.getString("player");
        return new Team(teamName, trophies, player);
    }
}
