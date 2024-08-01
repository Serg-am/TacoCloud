package com.example.TacoCloud.tacos;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;

public class RestIngredientService implements IngredientService {
    private RestTemplate restTemplate;

    public RestIngredientService(String accessToken)
    { this.restTemplate = new RestTemplate();
            if (accessToken != null) {
                this.restTemplate
                        .getInterceptors() .add(getBearerTokenInterceptor(accessToken));
            }
        }

        private ClientHttpRequestInterceptor getBearerTokenInterceptor(String accessToken) {
            ClientHttpRequestInterceptor interceptor = new ClientHttpRequestInterceptor() {
                @Override
                public ClientHttpResponse intercept(
                        HttpRequest request, byte[] bytes, ClientHttpRequestExecution execution) throws IOException {
                    request.getHeaders().add("Authorization", "Bearer " + accessToken);
                    return execution.execute(request, bytes);
                }
                };
            return interceptor; }
    @Override
    public Iterable<Ingredient> findAll() {
        return Arrays.asList(restTemplate.getForObject( "http://localhost:8080/api/ingredients", Ingredient[].class));
    }
    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        return restTemplate.postForObject( "http://localhost:8080/api/ingredients", ingredient,
                Ingredient.class);
    }
}
//tGv499nXIYbVlQS18T5zxoqVQh6StYD9JppG53J1ECo3I8tuz0dqqD10zMd7o0ocEzE5eC2Gs3EGmCAOO58pE7TvKM26uEPC1zyVvRkhfbuRjRHs60BmHP_R0AbpUGZH&state=ej4FKNnjvF5J9Nl61WN_ulqIMZEiQzsIvDXaaTRjk8o%3D