package com.videtech.wallet_transfer.service;

import com.videtech.wallet_transfer.domain.Transfer;
import com.videtech.wallet_transfer.domain.TransferStatus;
import com.videtech.wallet_transfer.repository.TransferRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TransferStatusService {

    private final TransferRepository transferRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void markFailed(Transfer transfer) {
        transfer.setStatus(TransferStatus.FAILED);
        transfer.setUpdatedAt(LocalDateTime.now());
        transferRepository.save(transfer);
    }
}