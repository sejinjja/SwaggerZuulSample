package com.example.zuultest.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Component
@Primary
@EnableAutoConfiguration
@EnableSwagger2
public class SwaggerConfiguration implements SwaggerResourcesProvider {

    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        SwaggerResource test = new SwaggerResource();
        resources.add(resource("doc1", "/api/test/v2/api-docs"));
        resources.add(resource("doc2", "/api/sample/v2/api-docs"));
        resources.add(resource("doc3", "/api/sample/v2/api-docs?groupname=tester"));
        return resources;
    }

    private SwaggerResource resource(String name, String location) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        return swaggerResource;
    }

}
