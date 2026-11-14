package in.practice.s_b_practical.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class modelmaperconfig {

        @Bean
        public ModelMapper modelMapper() {
            return new ModelMapper();
        }
}
