package ru.netology;

import org.codehaus.jackson.type.TypeReference;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;


public class JsonParser {
    private static ObjectMapper mapper = new ObjectMapper();
    private CloseableHttpResponse response;

    public JsonParser(CloseableHttpResponse response) {
        this.response = response;
    }

    public List<CatsFacts> getObjectFromJson() throws IOException {
        InputStream content = response.getEntity().getContent();
        List<CatsFacts> posts = mapper.readValue(content, new TypeReference<List<CatsFacts>>() {
        });
        return posts.stream()
                .filter(value ->  value.getUpvotes() != null  &&  value.getUpvotes() > 0)
                .collect(Collectors.toList());
    }
}