package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import org.jetbrains.annotations.NotNull;

/* compiled from: TimeSource.kt */
@SinceKotlin(version = "1.9")
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\f\u0082\u0002\u0004\n\u0002\b!¨\u0006\u000f"}, m7105d2 = {"Lkotlin/time/TimeMark;", "", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "hasNotPassedNow", "", "hasPassedNow", "minus", "duration", "minus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "plus", "plus-LRDsOJo", "kotlin-stdlib"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
/* loaded from: classes5.dex */
public interface TimeMark {
    /* renamed from: elapsedNow-UwyO8pc */
    long mo17015elapsedNowUwyO8pc();

    boolean hasNotPassedNow();

    boolean hasPassedNow();

    @NotNull
    /* renamed from: minus-LRDsOJo */
    TimeMark mo17016minusLRDsOJo(long duration);

    @NotNull
    /* renamed from: plus-LRDsOJo */
    TimeMark mo17018plusLRDsOJo(long duration);

    /* compiled from: TimeSource.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        @NotNull
        /* renamed from: plus-LRDsOJo */
        public static TimeMark m17163plusLRDsOJo(@NotNull TimeMark timeMark, long j) {
            return new AdjustedTimeMark(timeMark, j, null);
        }

        @NotNull
        /* renamed from: minus-LRDsOJo */
        public static TimeMark m17162minusLRDsOJo(@NotNull TimeMark timeMark, long j) {
            return timeMark.mo17018plusLRDsOJo(Duration.m17078unaryMinusUwyO8pc(j));
        }

        public static boolean hasPassedNow(@NotNull TimeMark timeMark) {
            return !Duration.m17058isNegativeimpl(timeMark.mo17015elapsedNowUwyO8pc());
        }

        public static boolean hasNotPassedNow(@NotNull TimeMark timeMark) {
            return Duration.m17058isNegativeimpl(timeMark.mo17015elapsedNowUwyO8pc());
        }
    }
}
