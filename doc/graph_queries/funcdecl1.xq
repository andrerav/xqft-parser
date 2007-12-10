declare function local:order-value()
{
      sum(/purchase/order-item/(@price * @quantity))
};

$value = local:order-value();