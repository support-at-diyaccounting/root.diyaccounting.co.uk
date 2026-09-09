/*
 * SPDX-License-Identifier: LicenseRef-PolyForm-Internal-Use-1.0.0
 * Copyright (C) 2006-2026 DIY Accounting Limited
 */

package co.uk.diyaccounting.root.stacks;

import co.uk.diyaccounting.root.SubmitSharedNames;

public interface SubmitStackProps {
    String envName();

    String deploymentName();

    String resourceNamePrefix();

    String cloudTrailEnabled();

    SubmitSharedNames sharedNames();
}
