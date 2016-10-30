package com.shoji;

import com.noelherrick.jell.Jell;
import com.noelherrick.jell.containers.Dyno;
import com.shoji.model.*;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.sql2o.Connection;
import org.sql2o.QuirksMode;
import org.sql2o.Sql2o;

import java.io.IOException;
//import java.sql.*;
import java.sql.SQLException;
import java.util.List;
import java.util.Collection;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String ENDPOINT = "https://api.github.com/repos/square/okhttp/contributors";

    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );

        // GSON
//        Article article = new Article("123", "ABC", "http://www.example.com", new User("123", "Taro", "http://www.example.com/image.png"));
//        Gson gson = new Gson();
//        String json = gson.toJson(article);
//        System.out.println(json);

        // OkHttp
//        runOkHttp(ENDPOINT);

//        jdbcPostgres();

        // sql2o
        sql2oPostgres();
    }

    static String runOkHttp(String url) throws IOException
    {
        // OkHttp
        OkHttpClient client = new OkHttpClient();

        // Create request for remote resource
        Request request = new Request.Builder()
                .url(url)
                .build();

        // Execute the request and retrieve the response.
        Response response = client.newCall(request).execute();

        // Deserialize HTTP response to concrete type.
        ResponseBody body = response.body();
        System.out.println(body.string());

        return body.string();
    }

    static void jdbcPostgres()
    {
//        // クラスのロード
//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        // コネクションの取得
//        Connection connection = null;
//
//        try {
//            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/rossmann", "postgres", "nishi0320");
//
//            // SQL文
//            PreparedStatement preparedStatement = connection.prepareStatement("select * from train where store = ?;");
//            preparedStatement.setInt(1, 1);
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("store"));
//            }
//
//            // 後処理
//            preparedStatement.close();
//            resultSet.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }

    static void jellPostgres() throws SQLException
    {
//        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/rossmann", "postgres", "nishi0320");
//        Jell jell = new Jell(connection);
//
//        String sql = "select * from train where store = 1;";

//        Collection<Train> results = jell.query(sql);
    }

    static void sql2oPostgres()
    {
        Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/rossmann", "postgres", "nishi0320", QuirksMode.PostgreSQL);
        String sql = "select * from train where store = :store;";

        try (Connection connection = sql2o.open()) {

            List<Train> trains = connection.createQuery(sql)
                    .addParameter("store", 1)
                    .executeAndFetch(Train.class);

            System.out.println(trains.get(0).getStore());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
