package etc;

import java.time.LocalDateTime;

import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import spring.Member;

public class JacksonMain {

	public static void main(String[] args) throws JsonProcessingException {
		Member member = new Member("email", "pwd", "name", LocalDateTime.now());
		
		ObjectMapper objectMapper = Jackson2ObjectMapperBuilder
				.json()
				.featuresToEnable(SerializationFeature.INDENT_OUTPUT)
				//.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
				//.simpleDateFormat("yyyyMMddHHmmss")
				.build();

		System.out.println(objectMapper.writeValueAsString(member));
	}
}
