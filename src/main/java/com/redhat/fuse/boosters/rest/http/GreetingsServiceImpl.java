package com.redhat.fuse.boosters.rest.http;

import org.apache.camel.Header;
import org.springframework.stereotype.Service;

import com.coh.greetinglibrary2.GreetingStarter;

@Service("greetingsService")
public class GreetingsServiceImpl implements GreetingsService {

    private static final String THE_GREETINGS = "Hello, ";

    @Override
    public Greetings getGreetings(@Header("name") String name ) {
        return new Greetings( GreetingStarter.getSalutation() + name );
    }

}