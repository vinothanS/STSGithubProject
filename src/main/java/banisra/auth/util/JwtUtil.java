package banisra.auth.util;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Component
public class JwtUtil {

    public static  final  String SECRET="s/Fn/2A1NXZUMxAjgMURMHNk0mzoyCvN3joBrQ3Eht8DOp7V+K0fVvNgKgiZuIv+";

    public String generateToken(String email)
    {
        Map<String, Object> claims= new HashMap<>();
        return createToken(claims,email);
    }


    private String createToken(Map<String,Object> claims, String email ){
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(email)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 30 ))
                .signWith(getSignkey(), SignatureAlgorithm.HS256)
                .compact();
    }

    private Key getSignkey()
    {
        byte[] keyBytes= Decoders.BASE64.decode(SECRET);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
