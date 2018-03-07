package etc;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import spring.Member;
import spring.RegisterRequest;

public class JacksonMain {

	public static void main(String[] args) throws IOException {
		// serialize();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		ObjectMapper objectMapper2 = Jackson2ObjectMapperBuilder
				.json()
				.featuresToEnable(SerializationFeature.INDENT_OUTPUT)
				.serializerByType(LocalDateTime.class, new LocalDateTimeSerializer(formatter))
				.deserializerByType(LocalDateTime.class, new LocalDateTimeDeserializer(formatter))
				.simpleDateFormat("yyyyMMdd HHmmss")
				.build();

		String json = "{\n" + 
				"  \"email\": \"madvirus@madvirus.net\",\n" + 
				"  \"password\": \"1234\",\n" + 
				"  \"confirmPassword\": \"1234\",\n" + 
				"  \"name\": \"최범균\"\n" + 
				"}";
		RegisterRequest regReq = objectMapper2.readValue(json, RegisterRequest.class);
	}

	private static void serialize() throws JsonProcessingException {
		Member member = new Member("email", "pwd", "name", LocalDateTime.now());
		
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");	    
		ObjectMapper objectMapper = Jackson2ObjectMapperBuilder
				.json()
				.featuresToEnable(SerializationFeature.INDENT_OUTPUT)
				.serializerByType(LocalDateTime.class, new LocalDateTimeSerializer(formatter))
				.deserializerByType(LocalDateTime.class, new LocalDateTimeDeserializer(formatter))
				//.modules(javaTimeModule)
				//.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
				//.simpleDateFormat("yyyyMMddHHmmss")
				.build();

		System.out.println(objectMapper.writeValueAsString(member));
	}
}
