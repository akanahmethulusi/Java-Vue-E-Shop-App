<template>
  <div class="container mt-4">
    <div class="row">

      <div
        class="col-12 col-md-6 col-lg-4 mb-4"
        v-for="(item, index) in products"
        :key="index"
      >
        <div class="card h-100 shadow-sm">

          <!-- Produktbild -->
          <img
            :src="item.image"
            class="card-img-top product-image"
            alt="product image"
          />

          <div class="card-body d-flex flex-column">

            <!-- Name -->
            <h5 class="card-title">{{ item.name }}</h5>

            <!-- Beschreibung -->
            <p class="card-text text-muted">
              {{ item.description }}
            </p>

            <!-- Features -->
            <ul class="list-unstyled" v-html="item.features"></ul>

            <!-- Seller -->
            <small class="text-muted">
              Seller:
              <a :href="`/seller/${item.seller.id}`">
                {{ item.seller.name }}
              </a>
            </small>

            <!-- Delivery -->
            <div class="mt-2">
              <span v-if="item.freeDelivery" class="badge bg-success">
                FREE Delivery
              </span>
              <span v-else class="text-muted">
                Delivery in {{ item.deliveryIn }}
              </span>
            </div>

            <!-- Spacer -->
            <div class="flex-grow-1"></div>

            <!-- Price & Availability -->
            <div class="d-flex justify-content-between align-items-center mt-3">
              <strong class="price">
                {{item.money_symbol}}{{ item.price }}
              </strong>
              <span
                v-if="item.available > 0"
                class="badge bg-primary"
              >
                In Stock
              </span>
              <span
                v-else
                class="badge bg-danger"
              >
                Out of Stock
              </span>
            </div>

            <!-- Buttons -->
            <div class="mt-3 d-flex gap-2">
              <button class="btn btn-primary btn-sm w-50">
                Add to Basket
              </button>
              <button class="btn btn-success btn-sm w-50">
                Buy Now
              </button>
            </div>

          </div>
        </div>
      </div>

    </div>
  </div>

</template>

<script>
export default {
  name: 'ProductList',
  components: {},
  computed:{
    products() {
        return [
                {
                'image': '/images/1626453423808.jpg',
                'name': 'Awesome Product 1',
                'description': 'Product features description',
                'seller': {
                            id:1,
                            name: 'Avesome company 1'
                            },
                'features': '<li>black color</li><li>pink color</li>',
                'available': 2,
                'freeDelivery': true,
                'deliveryIn': 'in 3 days',
                'price': '110',
                'money_symbol': '€'
                },
                {
                'image': '/images/1626453424314.jpg',
                'name': 'Awesome Product 2',
                'description': 'Product features description',
                'seller': {
                        id:2,
                        name: 'Avesome company 2'
                        },
                'features': '<li>black color</li>',
                'available': 3,
                'freeDelivery': true,
                'deliveryIn': 'in 3 days',
                'price': '310',
                'money_symbol': '€'
                },
                {
                'image': '/images/1626453425376.jpg',
                'name': 'Awesome Product 3',
                'description': 'Product features description-3',
                'seller': {
                        id:2,
                        name: 'Avesome company 3'
                        },
                'features': '<li>black color</li>',
                'available': 4,
                'freeDelivery': true,
                'deliveryIn': 'in 2 days',
                'price': '78',
                'money_symbol': '€'
                },
{
                'image': '/images/1626453425242.jpg',
                'name': 'Awesome Product 4',
                'description': 'Product features description-4',
                'seller': {
                            id:1,
                            name: 'Avesome company 4'
                            },
                'features': '<li>black color</li>',
                'available': 2,
                'freeDelivery': true,
                'deliveryIn': 'in 3 days',
                'price': '210',
                                              'money_symbol': '€'
                },
                {
                'image': '/images/1626453425505.jpg',
                'name': 'Awesome Product 5',
                'description': 'Product features description-5',
                'seller': {
                        id:2,
                        name: 'Avesome company 5'
                        },
                'features': '<li>black color</li>',
                'available': 3,
                'freeDelivery': true,
                'deliveryIn': 'in 3 days',
                'price': '165',
                                              'money_symbol': '€'
                },
                {
                'image': '/images/1626453530300.jpg',
                'name': 'Awesome Product 3',
                'description': 'Product features description-6',
                'seller': {
                        id:2,
                        name: 'Avesome company 6'
                        },
                'features': '<li>black color</li>',
                'available': 4,
                'freeDelivery': true,
                'deliveryIn': 'in 2 days',
                'price': '78',
                                             'money_symbol': '€'
                }
            ];
        }
    }
}
</script>

<style scoped lang='scss'>

.product-image {
  height: 220px;
  object-fit: cover;
}
.price {
  font-size: 1.2rem;
}

.shopping-cart {
  font-family: 'Montserrat', sans-serif;
}

.shopping-cart.dark {
  background-color: #f6f6f6;
}

.shopping-cart .content {
  box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.075);
  background-color: white;
}

.shopping-cart .block-heading {
  padding-top: 50px;
  margin-bottom: 40px;
  text-align: center;
}

.shopping-cart .block-heading p {
  text-align: center;
  max-width: 420px;
  margin: auto;
  opacity: 0.7;
}

.shopping-cart .dark .block-heading p {
  opacity: 0.8;
}

.shopping-cart .block-heading h1,
.shopping-cart .block-heading h2,
.shopping-cart .block-heading h3 {
  margin-bottom: 1.2rem;
  color: #3b99e0;
}

.shopping-cart .items {
  margin: auto;
}

.shopping-cart .items .product {
  margin-bottom: 20px;
  padding-top: 20px;
  padding-bottom: 20px;
}

.shopping-cart .items .product .info {
  padding-top: 0px;
  text-align: center;
}

.shopping-cart .items .product .info .product-name {
  font-weight: 600;
}

.shopping-cart .items .product .info .product-name .product-info {
  font-size: 14px;
  margin-top: 15px;
}

.shopping-cart .items .product .info .product-name .product-info .product-info-detail {
  margin-bottom: 15px;
}

.shopping-cart .items .product .info .product-name .product-info .value {
  font-weight: 400;
}

.shopping-cart .items .product .info .quantity .quantity-input {
  margin: auto;
  width: 80px;
}

.shopping-cart .items .product .info .price {
  margin-top: 15px;
  font-weight: bold;
  font-size: 22px;
}

.shopping-cart .summary {
  border-top: 2px solid #5ea4f3;
  background-color: #f7fbff;
  height: 100%;
  padding: 30px;
}

.shopping-cart .summary h3 {
  text-align: center;
  font-size: 1.3em;
  font-weight: 600;
  padding-top: 20px;
  padding-bottom: 20px;
}

.shopping-cart .summary .summary-item:not(:last-of-type) {
  padding-bottom: 10px;
  padding-top: 10px;
  border-bottom: 1px solid rgba(0, 0, 0, 0.1);
}

.shopping-cart .summary .text {
  font-size: 1em;
  font-weight: 600;
}

.shopping-cart .summary .price {
  font-size: 1em;
  float: right;
}

.shopping-cart .summary button {
  margin-top: 20px;
}

.control-buttons {
  display: flex;
  flex-direction: column;
}

@media (min-width: 768px) {
  .shopping-cart .items .product .info {
    padding-top: 25px;
    text-align: left;
  }

  .shopping-cart .items .product .info .price {
    font-weight: bold;
    font-size: 22px;
    top: 17px;
  }

  .shopping-cart .items .product .info .quantity {
    text-align: center;
  }
  .shopping-cart .items .product .info .quantity .quantity-input {
    padding: 4px 10px;
    text-align: center;
  }


}
</style>
