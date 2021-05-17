package com.db.jaegerserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import io.jaegertracing.internal.JaegerTracer;
import io.jaegertracing.internal.samplers.ConstSampler;

@Configuration
public class JaegerConfig {


	@Bean
	public RestTemplate getrRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public JaegerTracer jaegerTracer() {
		
		return new io.jaegertracing.Configuration("jaeger-server")
				.withSampler(new io.jaegertracing.Configuration.SamplerConfiguration().withType(ConstSampler.TYPE).withParam(1))
				.withReporter(new io.jaegertracing.Configuration.ReporterConfiguration().withLogSpans(true))
				.getTracer();
	}

}
