package com.blackhub.bronline.game.core.constants;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* compiled from: Constants.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/constants/NumberFormatConstants;", "", "()V", "CENTS_DELIMITER", "", "DOUBLE_NUMBER_FORMAT", "", "DOUBLE_ONE_DECIMAL_PLACE", "formattedNumberRegex", "Lkotlin/text/Regex;", "getFormattedNumberRegex", "()Lkotlin/text/Regex;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
