package com.epam.fit.idbscart;

import io.vavr.control.Try;
import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.stream.IntStream;

@Log4j2
public class MainApplication {

    public static void main(String... args) {
        var useCase = new UseCaseImpl();
        mapStringArrayToIntArray(args)
                .map(useCase::execute)
                .onSuccess(result -> log.info("Validation complete. Result: {}", result))
                .onFailure(Exception.class, ex -> log.error("Exception executing useCase for: {}", args, ex));
    }

    private static Try<int[]> mapStringArrayToIntArray(String... array) {
        return Try.of(() -> Arrays.stream(array))
                .map(stream -> stream.mapToInt(Integer::parseInt))
                .map(IntStream::toArray);
    }

}
