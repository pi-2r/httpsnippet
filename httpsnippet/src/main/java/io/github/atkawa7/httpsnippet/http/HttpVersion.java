package io.github.atkawa7.httpsnippet.http;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class HttpVersion {
    public static final String HTTP = "HTTP";

    public static final HttpVersion HTTP_0_9 = new HttpVersion(0, 9);
    public static final HttpVersion HTTP_1_0 = new HttpVersion(1, 0);
    public static final HttpVersion HTTP_1_1 = new HttpVersion(1, 1);
    public static final HttpVersion HTTP_2_0 = new HttpVersion(2, 0);

    private final int major;
    private final int minor;
    private final String protocolName;

    private HttpVersion(int major, int minor) {
        this(major, minor, String.format("%s/%s.%s", HTTP, major, minor));
    }

    public boolean equalsIgnoreCase(String httpVersion) {
        return this.protocolName.equalsIgnoreCase(httpVersion);
    }

    @Override
    public String toString() {
        return protocolName;
    }
}
