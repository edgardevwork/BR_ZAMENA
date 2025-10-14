package com.blackhub.bronline.game.core.constants;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* compiled from: Constants.kt */
@StabilityInferred(parameters = 0)

public final class NumberFormatConstants {
    public static final int CENTS_DELIMITER = 100;

    @NotNull
    public static final String DOUBLE_NUMBER_FORMAT = "#.##";

    @NotNull
    public static final String DOUBLE_ONE_DECIMAL_PLACE = "#.#";

    @NotNull
    public static final NumberFormatConstants INSTANCE = new NumberFormatConstants();

    @NotNull
    public static final Regex formattedNumberRegex = new Regex("^[0-9\\s]{1,12}[.,]?[0-9]{0,2}$");
    public static final int $stable = 8;

    @NotNull
    public final Regex getFormattedNumberRegex() {
        return formattedNumberRegex;
    }
}

