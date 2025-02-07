/*
 * Copyright (C) 2011 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.management.phase.mock;

import com.topcoder.management.phase.PhaseValidationException;
import com.topcoder.management.phase.PhaseValidator;
import com.topcoder.project.phases.Phase;

/**
 * <p>
 * This class is used only for testing purposes.
 * </p>
 * @author sokol
 * @version 1.0
 * @since 1.1
 */
public class MockExceptionPhaseValidator implements PhaseValidator {

    /**
     * <p>
     * Always throws NullPointerException while creating.
     * </p>
     */
    public MockExceptionPhaseValidator() {
        throw new NullPointerException("just for testing.");
    }

    /**
     * <p>
     * Do nothing.
     * </p>
     * @param phase the phase to validate
     * @throws PhaseValidationException never
     */
    public void validate(Phase phase) throws PhaseValidationException {
        // do nothing
    }
}
