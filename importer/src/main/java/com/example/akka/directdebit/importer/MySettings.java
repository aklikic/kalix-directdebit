package com.example.akka.directdebit.importer;

import com.typesafe.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MySettings {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public final int paymentCreditDelaySeconds;
    public final int importPaymentParallelism;
    public final int importTransactionParallelism;

    public MySettings(Config config) {
        this.paymentCreditDelaySeconds = config.getInt("payment.credit-delay-seconds");
        logger.info("paymentCreditDelaySeconds: {}", this.paymentCreditDelaySeconds);
        this.importPaymentParallelism = config.getInt("import.payment.parallelism");
        logger.info("importPaymentParallelism: {}", this.importPaymentParallelism);
        this.importTransactionParallelism = config.getInt("import.transaction.parallelism");
        logger.info("importTransactionParallelism: {}", this.importTransactionParallelism);
    }

    public MySettings(int paymentCreditDelaySeconds, int importPaymentParallelism, int importTransactionParallelism) {
        this.paymentCreditDelaySeconds = paymentCreditDelaySeconds;
        this.importPaymentParallelism = importPaymentParallelism;
        this.importTransactionParallelism = importTransactionParallelism;
    }
}
