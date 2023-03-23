package io.freevariable.transacto;

import io.freevariable.transacto.model.Transaction;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class TransactionGenerator {

    public List<Transaction> generateTransactions(int numTransactions,
                                                  LocalDateTime startDate,
                                                  LocalDateTime endDate) {

        List<Transaction> transactions = new ArrayList<>();

        // If no start and end dates are provided, create a random date range
        if (startDate == null || endDate == null) {
            LocalDateTime now = LocalDateTime.now();
            startDate = now.minusDays(30);
            endDate = now;
        }

        // Generate transactions

        return transactions;
    }

    private LocalDateTime generateRandomDate(LocalDateTime start, LocalDateTime end) {
        long startEpochSecond = start.toEpochSecond(ZoneOffset.UTC);
        long endEpochSecond = end.toEpochSecond(ZoneOffset.UTC);
        long randomEpochSecond = ThreadLocalRandom.current().nextLong(startEpochSecond, endEpochSecond);
        return LocalDateTime.ofEpochSecond(randomEpochSecond, 0, ZoneOffset.UTC);
    }

}

