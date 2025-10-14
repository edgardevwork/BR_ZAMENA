package com.blackhub.bronline.game.common.mkloader.util;

import com.blackhub.bronline.game.common.mkloader.exception.InvalidNumberOfPulseException;
import com.blackhub.bronline.game.common.mkloader.type.ClassicSpinner;
import com.blackhub.bronline.game.common.mkloader.type.FishSpinner;
import com.blackhub.bronline.game.common.mkloader.type.LineSpinner;
import com.blackhub.bronline.game.common.mkloader.type.LoaderView;
import com.blackhub.bronline.game.common.mkloader.type.PhoneWave;
import com.blackhub.bronline.game.common.mkloader.type.Pulse;
import com.blackhub.bronline.game.common.mkloader.type.Radar;
import com.blackhub.bronline.game.common.mkloader.type.Sharingan;
import com.blackhub.bronline.game.common.mkloader.type.TwinFishesSpinner;
import com.blackhub.bronline.game.common.mkloader.type.Whirlpool;
import com.blackhub.bronline.game.common.mkloader.type.Worm;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import java.util.Objects;

/* loaded from: classes.dex */
public class LoaderGenerator {
    public static LoaderView generateLoaderView(int type) {
        switch (type) {
            case 1:
                return new FishSpinner();
            case 2:
                return new LineSpinner();
            case 3:
                try {
                    return new Pulse(3);
                } catch (InvalidNumberOfPulseException e) {
                    String message = e.getMessage();
                    Objects.requireNonNull(message);
                    UtilsKt.crashlyticsRecordNewException(message);
                }
            case 4:
                try {
                    return new Pulse(4);
                } catch (InvalidNumberOfPulseException e2) {
                    String message2 = e2.getMessage();
                    Objects.requireNonNull(message2);
                    UtilsKt.crashlyticsRecordNewException(message2);
                }
            case 5:
                try {
                    return new Pulse(5);
                } catch (InvalidNumberOfPulseException e3) {
                    String message3 = e3.getMessage();
                    Objects.requireNonNull(message3);
                    UtilsKt.crashlyticsRecordNewException(message3);
                }
            case 6:
                return new Radar();
            case 7:
                return new TwinFishesSpinner();
            case 8:
                return new Worm();
            case 9:
                return new Whirlpool();
            case 10:
                return new PhoneWave();
            case 11:
                return new Sharingan();
            default:
                return new ClassicSpinner();
        }
    }
}
