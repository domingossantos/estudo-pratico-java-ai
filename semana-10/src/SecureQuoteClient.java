package course.week10;
import java.net.URI; import java.net.http.HttpClient; import java.time.Duration;
public final class SecureQuoteClient {
 private final HttpClient client; private final Duration timeout; public SecureQuoteClient(HttpClient c,Duration t){client=c;timeout=t;}
 public String fetch(URI uri){throw new UnsupportedOperationException("Implement HTTP fetch");}
 public String sign(String payload,byte[] key){throw new UnsupportedOperationException("Implement HMAC");}
}
