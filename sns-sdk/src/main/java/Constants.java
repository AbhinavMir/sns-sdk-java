import org.p2p.solanaj.core.PublicKey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Constants {
        PublicKey NAME_PROGRAM_ID = new PublicKey("namesLPneVptA9Z5rqUDD9tMTWEJwofgaYwp8cawRkX");
        String HASH_PREFIX = "SPL Name Service";
        PublicKey ROOT_DOMAIN_ACCOUNT = new PublicKey("58PwtjSDuFHuUkYjH9BYnnQKHfwo9reZhC2zMJv9JPkx");
        PublicKey REGISTER_PROGRAM_ID = new PublicKey("jCebN34bUfdeUYJT13J1yG16XWQpt5PDx6Mse9GUqhR");
        PublicKey PYTH_FIDA_PRICE_ACC = new PublicKey("ETp9eKXVv1dWwHSpsXRUuXHmw24PwRkttCGVgpZEY9zF");
        PublicKey BONFIDA_FIDA_BNB = new PublicKey("AUoZ3YAhV3b2rZeEH93UMZHXUZcTramBvb4d9YEVySkc");
        PublicKey REVERSE_LOOKUP_CLASS = new PublicKey("33m47vH6Eav6jr5Ry86XjhRft2jRBLDnDgPSHoquXi2Z");
        PublicKey TWITTER_VERIFICATION_AUTHORITY = new PublicKey(
                        "FvPH7PrVrLGKPfqaf3xJodFTjZriqrAXXLTVWEorTFBi");
        PublicKey TWITTER_ROOT_PARENT_REGISTRY_KEY = new PublicKey(
                        "4YcexoW3r78zz16J2aqmukBLRwGq6rAvWzJpkYAXqebv");
        int SOL_RECORD_SIG_LEN = 96;
        PublicKey BONFIDA_USDC_BNB = new PublicKey("DmSyHDSM9eSLyvoLsPvDr5fRRFZ7Bfr3h3ULvWpgQaq7");
        PublicKey USDC_MINT = new PublicKey("EPjFWdd5AufqSSqeM2qN1xzybapC8G4wEGGkZwyTDt1v");
        List<PublicKey> REFERRERS = Arrays.asList(
                        new PublicKey("3ogYncmMM5CmytsGCqKHydmXmKUZ6sGWvizkzqwT7zb1"), // Test wallet
                        new PublicKey("DM1jJCkZZEwY5tmWbgvKRxsDFzXCdbfrYCCH1CtwguEs"), // 4Everland
                        new PublicKey("ADCp4QXFajHrhy4f43pD6GJFtQLkdBY2mjS9DfCk7tNW") // Bandit network
        );

        PublicKey PYTH_MAPPING_ACC = new PublicKey("AHtgzX45WTKfkPG53L6WYhGEXwQkN1BVknET3sVsLL8J");
        PublicKey VAULT_OWNER = new PublicKey("GcWEQ9K78FV7LEHteFVciYApERk5YvQuFDQPk1yYJVXi");

        static {
                Map<String, String> TOKENS_SYM_MINT = new HashMap<>();

                TOKENS_SYM_MINT.put("EPjFWdd5AufqSSqeM2qN1xzybapC8G4wEGGkZwyTDt1v", "USDC");
                TOKENS_SYM_MINT.put("Es9vMFrzaCERmJfrF4H2FYD4KCoNkY11McCe8BenwNYB", "USDT");
                TOKENS_SYM_MINT.put("So11111111111111111111111111111111111111112", "SOL");
                TOKENS_SYM_MINT.put("EchesyfXePKdLtoiZSL8pBe8Myagyy8ZRqsACNCFGnvp", "FIDA");
                TOKENS_SYM_MINT.put("FeGn77dhg1KXRRFeSwwMiykZnZPw5JXW6naf2aQgZDQf", "ETH");
                TOKENS_SYM_MINT.put("7i5KKsX2weiTkry7jA4ZwSuXGhs5eJBEjY8vVxR4pfRx", "GMT");
                TOKENS_SYM_MINT.put("AFbX8oGjGpmVFywbVouvhQSRmiW2aR1mohfahi4Y2AdB", "GST");
                TOKENS_SYM_MINT.put("mSoLzYCxHdYgdzU16g5QSh3i5K3z3KZK7ytfqcJm7So", "MSOL");
                TOKENS_SYM_MINT.put("DezXAZ8z7PnrnRJjz3wXBoRgixCa6xjnB7YaB1pPB263", "BONK");
                TOKENS_SYM_MINT.put("EPeUFDgHRxs9xxEPVaL6kfGQvCon7jmAWKVUHuux1Tpz", "BAT");
        }
}