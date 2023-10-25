package com.example.yesdi;

import org.springframework.stereotype.Service;

@Service // Bean化
public class ShainServiceImpl implements ShainService {

  private final ShainRepository shainRepository;

  // ShainRepositoryのDI
  public ShainServiceImpl(ShainRepository shainRepository) {
    this.shainRepository = shainRepository;
  }

  @Override
  public String findByNo(String number) {
    // リポジトリから社員を選択
    String name = shainRepository.selectByNo(number);
    return name;
  }

}
