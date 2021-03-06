package cc.michael.febs.server.test.service;

import cc.michael.febs.common.core.entity.system.TradeLog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author michael
 */
public interface ITradeLogService extends IService<TradeLog> {

    /**
     * 下单并支付
     *
     * @param tradeLog 交易日志
     */
    void orderAndPay(TradeLog tradeLog);
}