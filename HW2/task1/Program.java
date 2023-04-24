package HW2.task1;

// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.

// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static String getReq(Map<String, String> params) {
        StringBuilder request = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getValue() != "null") {
                request.append(String.format("%s = '%s', " , pair.getKey(), pair.getValue()));
            }
        }
        String res = request.substring(0, request.lastIndexOf(", "));
        return res.toString();
    }

    public static void main(String[] args) {
        Map<String, String> param = new HashMap<String, String>();
        param.put("name", "Ivanov");
        param.put("country", "Russia");
        param.put("city", "Moscow");
        param.put("age", "null");
        System.out.println(getReq(param));

    }
}