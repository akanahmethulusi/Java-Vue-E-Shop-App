const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,

  devServer: {
      port: 8081, // dein Frontend-Port
      proxy: {
        '/images': {
          target: 'http://localhost:8080',
          changeOrigin: true
        },
        '/api': {
          target: 'http://localhost:8080',
          changeOrigin: true
        }
      }
    }
})
