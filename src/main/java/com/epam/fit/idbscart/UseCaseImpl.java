package com.epam.fit.idbscart;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class UseCaseImpl implements UseCase {

    public boolean execute(int... array) {
        log.trace("executing useCase for: {}", array);
        return iterateThroughArray(0, array);
    }

    private boolean iterateThroughArray(int currentPosition, int... array) {
        log.trace("Checking if {} is the last position in {}", currentPosition, array);
        if (array.length - 1 == currentPosition) {
            return true;
        }
        log.trace("Checking if {} position has a zero(0) in {}", currentPosition, array);
        if (currentPosition >= array.length || array[currentPosition] == 0) {
            return false;
        }

        log.trace("Iterating array with position {}", currentPosition);
        return iterateOverCurrentValue(currentPosition, array);
    }

    private boolean iterateOverCurrentValue(int currentPosition, int... array) {
        var result = false;
        for (int i = 0; i < array[currentPosition]; i++) {
            if ((array[currentPosition] + currentPosition) <= (array.length - 1)) {
                result = iterateThroughArray(array[currentPosition] + currentPosition, array);
            }
            result = result || (array[currentPosition] > 1
                    && iterateThroughArray(currentPosition + array[currentPosition] - i, array));
            if (result) {
                break;
            }
        }
        return result;
    }
}
