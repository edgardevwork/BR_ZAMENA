package coil.util;

import coil.size.Dimension;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HardwareBitmaps.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m7105d2 = {"Lcoil/util/LimitedFileDescriptorHardwareBitmapService;", "Lcoil/util/HardwareBitmapService;", "logger", "Lcoil/util/Logger;", "(Lcoil/util/Logger;)V", "allowHardwareMainThread", "", "size", "Lcoil/size/Size;", "allowHardwareWorkerThread", "Companion", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHardwareBitmaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardwareBitmaps.kt\ncoil/util/LimitedFileDescriptorHardwareBitmapService\n+ 2 Dimension.kt\ncoil/size/-Dimensions\n*L\n1#1,215:1\n57#2:216\n57#2:217\n*S KotlinDebug\n*F\n+ 1 HardwareBitmaps.kt\ncoil/util/LimitedFileDescriptorHardwareBitmapService\n*L\n45#1:216\n46#1:217\n*E\n"})
/* loaded from: classes.dex */
public final class LimitedFileDescriptorHardwareBitmapService implements HardwareBitmapService {
    public static final int MIN_SIZE_DIMENSION = 100;

    @Nullable
    public final Logger logger;

    public LimitedFileDescriptorHardwareBitmapService(@Nullable Logger logger) {
        this.logger = logger;
    }

    @Override // coil.util.HardwareBitmapService
    public boolean allowHardwareMainThread(@NotNull Size size) {
        Dimension width = size.getWidth();
        if ((width instanceof Dimension.Pixels ? ((Dimension.Pixels) width).px : Integer.MAX_VALUE) > 100) {
            Dimension height = size.getHeight();
            if ((height instanceof Dimension.Pixels ? ((Dimension.Pixels) height).px : Integer.MAX_VALUE) > 100) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.util.HardwareBitmapService
    /* renamed from: allowHardwareWorkerThread */
    public boolean getAllowHardware() {
        return FileDescriptorCounter.INSTANCE.hasAvailableFileDescriptors(this.logger);
    }
}
