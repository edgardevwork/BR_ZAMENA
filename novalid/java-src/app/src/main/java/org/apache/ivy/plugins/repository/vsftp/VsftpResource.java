package org.apache.ivy.plugins.repository.vsftp;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ivy.plugins.repository.LazyResource;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class VsftpResource extends LazyResource {
    public VsftpRepository repository;

    public VsftpResource(VsftpRepository vsftpRepository, String str) {
        super(str);
        this.repository = vsftpRepository;
    }

    @Override // org.apache.ivy.plugins.repository.LazyResource
    public void init() {
        try {
            init(this.repository.getInitResource(getName()));
        } catch (IOException e) {
            Message.debug(e);
            Message.verbose(e.toString());
        }
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public InputStream openStream() throws IOException {
        throw new UnsupportedOperationException("vsftp resource does not support openStream operation");
    }

    @Override // org.apache.ivy.plugins.repository.Resource
    public Resource clone(String str) {
        try {
            return this.repository.getResource(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
