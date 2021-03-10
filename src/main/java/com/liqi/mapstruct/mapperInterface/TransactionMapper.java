package com.liqi.mapstruct.mapperInterface;

import com.liqi.mapstruct.pojo.Transaction;
import com.liqi.mapstruct.pojo.TransactionDTO;
import org.mapstruct.Mapper;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

/**
 * @author Sky
 * create  2021-03-10 09:13
 * email sky.li@ixiaoshuidi.com
 */
@Mapper(componentModel = "spring")
public abstract class TransactionMapper {

    public TransactionDTO toTransactionDTO(Transaction transaction) {
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setUuid(transaction.getUuid());
        transactionDTO.setTotalInCents(transaction.getTotal()
                .multiply(new BigDecimal("100")).longValue());
        return transactionDTO;
    }

    public abstract List<TransactionDTO> toTransactionDTO(
            Collection<Transaction> transactions);
}
