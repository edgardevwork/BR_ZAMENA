package coil.util;

import coil.size.Size;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: HardwareBitmaps.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lcoil/util/ImmutableHardwareBitmapService;", "Lcoil/util/HardwareBitmapService;", "allowHardware", "", "(Z)V", "allowHardwareMainThread", "size", "Lcoil/size/Size;", "allowHardwareWorkerThread", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class ImmutableHardwareBitmapService implements HardwareBitmapService {
    public final boolean allowHardware;

    public ImmutableHardwareBitmapService(boolean z) {
        this.allowHardware = z;
    }

    @Override // coil.util.HardwareBitmapService
    public boolean allowHardwareMainThread(@NotNull Size size) {
        return this.allowHardware;
    }

    @Override // coil.util.HardwareBitmapService
    /* renamed from: allowHardwareWorkerThread, reason: from getter */
    public boolean getAllowHardware() {
        return this.allowHardware;
    }
}
